package com.examen.App.web3.db;

import com.examen.App.web3.model.Appointment;
import com.examen.App.web3.model.Car;
import com.examen.App.web3.model.Image;
import com.examen.App.web3.model.User;
import com.examen.App.web3.repository.AppointmentRepository;
import com.examen.App.web3.repository.CarRepository;
import com.examen.App.web3.repository.ImageRepository;
import com.examen.App.web3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private UserRepository userRepository;



    @Override
    public void run(String... args) throws Exception {
        // Insérer des voitures
        Car car1 = new Car();
        car1.setName("Car A");
        car1.setDescription("Description A");
        car1.setBrand("Brand A");
        car1.setModel("Model A");
        car1.setPrice(new BigDecimal("20000.00"));
        car1.setColor("Red");
        car1.setMotorType("Gasoline");
        car1.setPower(150);
        car1.setPlaceNumber(4);
        car1.setStatus(Car.Status.Pinned);
        car1.setType("SUV");
        carRepository.save(car1);

        Car car2 = new Car();
        car2.setName("Car B");
        car2.setDescription("Description B");
        car2.setBrand("Brand B");
        car2.setModel("Model B");
        car2.setPrice(new BigDecimal("25000.00"));
        car2.setColor("Blue");
        car2.setMotorType("Diesel");
        car2.setPower(180);
        car2.setPlaceNumber(4);
        car2.setStatus(Car.Status.NotPinned);
        car2.setType("Sedan");
        carRepository.save(car2);

        Car car3 = new Car();
        car3.setName("Car C");
        car3.setDescription("Description C");
        car3.setBrand("Brand C");
        car3.setModel("Model C");
        car3.setPrice(new BigDecimal("30000.00"));
        car3.setColor("Green");
        car3.setMotorType("Electric");
        car3.setPower(200);
        car3.setPlaceNumber(4);
        car3.setStatus(Car.Status.Pinned);
        car3.setType("Coupe");
        carRepository.save(car3);

        // Insérer des images
        Image image1 = new Image();
        image1.setCar(car1);
        image1.setUrl("https://www.tesla.com/sites/default/files/modelsx-new/social/model-s-hero-social.jpg");
        imageRepository.save(image1);

        Image image2 = new Image();
        image2.setCar(car2);
        image2.setUrl("https://www.audiusa.com/content/dam/nemo/us/models/q7/2023/overview/stage/q7-overview-01.jpg");
        imageRepository.save(image2);

        Image image3 = new Image();
        image3.setCar(car3);
        image3.setUrl("https://cdn.motor1.com/images/mgl/6xJxn/s1/2022-bmw-7-series.jpg");
        imageRepository.save(image3);

        // Insérer des rendez-vous
        Appointment appointment1 = new Appointment();
        appointment1.setCar(car1);
        appointment1.setName("Doe");
        appointment1.setFirstName("John");
        appointment1.setEmail("john.doe@example.com");
        appointment1.setMessage("I would like to test drive this car.");
        appointment1.setContact("1234567890");
        appointment1.setAppointmentDate(LocalDateTime.of(2024, 6, 1, 10, 0));
        appointment1.setStatus(Appointment.Status.pending);
        appointmentRepository.save(appointment1);

        Appointment appointment2 = new Appointment();
        appointment2.setCar(car2);
        appointment2.setName("Smith");
        appointment2.setFirstName("Jane");
        appointment2.setEmail("jane.smith@example.com");
        appointment2.setMessage("Interested in buying this car.");
        appointment2.setContact("0987654321");
        appointment2.setAppointmentDate(LocalDateTime.of(2024, 6, 2, 11, 0));
        appointment2.setStatus(Appointment.Status.validated);
        appointmentRepository.save(appointment2);

        Appointment appointment3 = new Appointment();
        appointment3.setCar(car3);
        appointment3.setName("Brown");
        appointment3.setFirstName("Mike");
        appointment3.setEmail("mike.brown@example.com");
        appointment3.setMessage("Need more details about this car.");
        appointment3.setContact("1122334455");
        appointment3.setAppointmentDate(LocalDateTime.of(2024, 6, 3, 12, 0));
        appointment3.setStatus(Appointment.Status.rejected);
        appointmentRepository.save(appointment3);

        // Insérer des utilisateurs
        User user1 = new User();
        user1.setId(UUID.randomUUID());
        user1.setName("Alice");
        user1.setEmail("alice@example.com");
        user1.setPassword("password123");
        userRepository.save(user1);

        User user2 = new User();
        user2.setId(UUID.randomUUID());
        user2.setName("Bob");
        user2.setEmail("bob@example.com");
        user2.setPassword("password456");
        userRepository.save(user2);

        User user3 = new User();
        user3.setId(UUID.randomUUID());
        user3.setName("Charlie");
        user3.setEmail("charlie@example.com");
        user3.setPassword("password789");
        userRepository.save(user3);
    }
}

