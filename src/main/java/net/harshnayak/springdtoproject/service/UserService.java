package net.harshnayak.springdtoproject.service;

import net.harshnayak.springdtoproject.dto.UserLocationDTO;
import net.harshnayak.springdtoproject.model.User;
import net.harshnayak.springdtoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){

       return userRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());

    }

    private UserLocationDTO convertEntityToDto(User user){

        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;

    }

}
