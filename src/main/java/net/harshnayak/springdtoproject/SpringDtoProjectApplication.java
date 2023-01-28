package net.harshnayak.springdtoproject;

import net.harshnayak.springdtoproject.model.Location;
import net.harshnayak.springdtoproject.model.User;
import net.harshnayak.springdtoproject.repository.LocationtRepository;
import net.harshnayak.springdtoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDtoProjectApplication implements CommandLineRunner {


	@Autowired

    private UserRepository userRepository;


	@Autowired
	private LocationtRepository locationtRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDtoProjectApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();

		location.setPlace("pune");
		location.setDescription("hi hello bye");
		location.setLongitude(12.5);
		location.setLatitude(3.6);


		locationtRepository.save(location);

		User user1 = new User();

		user1.setFirstName("harsh");
		user1.setLastName("nayak");
		user1.setEmail("harsh.nayak.12131@gmail.com");
		user1.setPassword("hi");
		user1.setLocation(location);

		userRepository.save(user1);



		User user2 = new User();

		user2.setFirstName("ayush");
		user2.setLastName("nayak");
		user2.setEmail("ayush.nayak.12131@gmail.com");
		user2.setPassword("hi");
        user2.setLocation(location);


		userRepository.save(user2);

	}
}