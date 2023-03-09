package controller;

import dto.EditPasswordDto;
import dto.EditUsernameDto;
import model.Profile;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import repository.ProfileRepository;
import repository.UserRepository;
import service.ProfileService;
import service.UserService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/profil")
public class ProfileController {

    @Autowired
    private ProfileService profileService;
    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<Profile> listProfiles(){
        return profileService.listAll();
    }

    @GetMapping("/byUser")
    public Profile findProfilByKorisnikUsername(@AuthenticationPrincipal User u) {
        return profileService.fetchByKorisnikUsername(u.getUsername());
    }

    @PutMapping("/getRate")
    public ResponseEntity<HashMap<String, Double>> getProfilRatings(@Valid @RequestBody RatingDTO dto){
        Profile profile = profileRepository.findById(dto.getIdObjavljaca()).get();
        Double grade = profile.getGrade();
        if(grade == 0){
            profile.setGrade(dto.getRating());
        }
        else{
            profile.setGrade((grade + dto.getRating()) / 2);
        }
        HashMap<String, Double> userRating = new HashMap<>();
        userRating.put(profile.getUser().getUsername(), profile.getGrade());
        profileRepository.save(profil);
        return ResponseEntity.ok(userRating);
    }

    @PutMapping("/username")
    public ResponseEntity<Profile> updateUsername(@AuthenticationPrincipal User u, @Valid @RequestBody EditUsernameDto dto){
        Profile updateProfile = profileService.fetchByKorisnikUsername(u.getUsername());
        User user = userService.fetchByUsername(u.getUsername());

        user.setUsername(dto.getUsername());
        updateProfile.setUser(user);
        profileRepository.save(updateProfil);
        return ResponseEntity.ok(updateProfil);
    }

    @PutMapping("/password")
    public ResponseEntity<Profile> updatePassword(@AuthenticationPrincipal User u, @Valid @RequestBody EditPasswordDto dto){
        Profile updateProfil = profileService.fetchByKorisnikUsername(u.getUsername());
        User user = userService.fetchByUsername(u.getUsername());

        user.setPassword(dto.getPassword());
        updateProfil.setUser(user);
        profileRepository.save(updateProfil);
        return ResponseEntity.ok(updateProfil);
    }


}


