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
        car1.setName("C-Class");
        car1.setDescription("Compact executive car");
        car1.setBrand("Mercedes-Benz");
        car1.setModel("2022");
        car1.setPrice(new BigDecimal("40000.00"));
        car1.setColor("Black");
        car1.setMotorType("Gasoline");
        car1.setPower(255);
        car1.setPlaceNumber(5);
        car1.setStatus(Car.Status.Pinned);
        car1.setType("Sedan");
        carRepository.save(car1);

        Car car2 = new Car();
        car2.setName("Model S");
        car2.setDescription("All-electric sedan");
        car2.setBrand("Tesla");
        car2.setModel("2022");
        car2.setPrice(new BigDecimal("79990.00"));
        car2.setColor("Red");
        car2.setMotorType("Electric");
        car2.setPower(670);
        car2.setPlaceNumber(5);
        car2.setStatus(Car.Status.NotPinned);
        car2.setType("Sedan");
        carRepository.save(car2);

        Car car3 = new Car();
        car3.setName("Mustang");
        car3.setDescription("Sporty coupe");
        car3.setBrand("Ford");
        car3.setModel("2022");
        car3.setPrice(new BigDecimal("55000.00"));
        car3.setColor("Blue");
        car3.setMotorType("Gasoline");
        car3.setPower(450);
        car3.setPlaceNumber(4);
        car3.setStatus(Car.Status.Pinned);
        car3.setType("Coupe");
        carRepository.save(car3);


        Car car4 = new Car();
        car4.setName("Civic");
        car4.setDescription("Compact car");
        car4.setBrand("Honda");
        car4.setModel("2022");
        car4.setPrice(new BigDecimal("22000.00"));
        car4.setColor("White");
        car4.setMotorType("Gasoline");
        car4.setPower(158);
        car4.setPlaceNumber(5);
        car4.setStatus(Car.Status.NotPinned);
        car4.setType("Sedan");
        carRepository.save(car4);

        Car car5 = new Car();
        car5.setName("Camry");
        car5.setDescription("Mid-size car");
        car5.setBrand("Toyota");
        car5.setModel("2022");
        car5.setPrice(new BigDecimal("25000.00"));
        car5.setColor("Gray");
        car5.setMotorType("Hybrid");
        car5.setPower(208);
        car5.setPlaceNumber(5);
        car5.setStatus(Car.Status.Pinned);
        car5.setType("Sedan");
        carRepository.save(car5);

        Car car6 = new Car();
        car6.setName("Model 3");
        car6.setDescription("All-electric sedan");
        car6.setBrand("Tesla");
        car6.setModel("2022");
        car6.setPrice(new BigDecimal("39990.00"));
        car6.setColor("White");
        car6.setMotorType("Electric");
        car6.setPower(283);
        car6.setPlaceNumber(5);
        car6.setStatus(Car.Status.NotPinned);
        car6.setType("Sedan");
        carRepository.save(car6);

        Car car7 = new Car();
        car7.setName("F-150");
        car7.setDescription("Full-size pickup truck");
        car7.setBrand("Ford");
        car7.setModel("2022");
        car7.setPrice(new BigDecimal("30000.00"));
        car7.setColor("Blue");
        car7.setMotorType("Gasoline");
        car7.setPower(290);
        car7.setPlaceNumber(6);
        car7.setStatus(Car.Status.Pinned);
        car7.setType("Truck");
        carRepository.save(car7);

        Car car8 = new Car();
        car8.setName("Accord");
        car8.setDescription("Mid-size car");
        car8.setBrand("Honda");
        car8.setModel("2022");
        car8.setPrice(new BigDecimal("24000.00"));
        car8.setColor("Black");
        car8.setMotorType("Gasoline");
        car8.setPower(192);
        car8.setPlaceNumber(5);
        car8.setStatus(Car.Status.NotPinned);
        car8.setType("Sedan");
        carRepository.save(car8);

        Car car9 = new Car();
        car9.setName("CX-5");
        car9.setDescription("Compact crossover SUV");
        car9.setBrand("Mazda");
        car9.setModel("2022");
        car9.setPrice(new BigDecimal("27000.00"));
        car9.setColor("Red");
        car9.setMotorType("Gasoline");
        car9.setPower(187);
        car9.setPlaceNumber(5);
        car9.setStatus(Car.Status.Pinned);
        car9.setType("SUV");
        carRepository.save(car9);

        Car car10 = new Car();
        car10.setName("Q5");
        car10.setDescription("Compact luxury crossover SUV");
        car10.setBrand("Audi");
        car10.setModel("2022");
        car10.setPrice(new BigDecimal("43000.00"));
        car10.setColor("White");
        car10.setMotorType("Gasoline");
        car10.setPower(261);
        car10.setPlaceNumber(5);
        car10.setStatus(Car.Status.NotPinned);
        car10.setType("SUV");
        carRepository.save(car10);

        Car car11 = new Car();
        car11.setName("3 Series");
        car11.setDescription("Compact executive car");
        car11.setBrand("BMW");
        car11.setModel("2022");
        car11.setPrice(new BigDecimal("41000.00"));
        car11.setColor("Blue");
        car11.setMotorType("Gasoline");
        car11.setPower(255);
        car11.setPlaceNumber(5);
        car11.setStatus(Car.Status.Pinned);
        car11.setType("Sedan");
        carRepository.save(car11);

        Car car12 = new Car();
        car12.setName("Altima");
        car12.setDescription("Mid-size car");
        car12.setBrand("Nissan");
        car12.setModel("2022");
        car12.setPrice(new BigDecimal("25000.00"));
        car12.setColor("Gray");
        car12.setMotorType("Gasoline");
        car12.setPower(188);
        car12.setPlaceNumber(5);
        car12.setStatus(Car.Status.NotPinned);
        car12.setType("Sedan");
        carRepository.save(car12);

        Car car13 = new Car();
        car13.setName("Cherokee");
        car13.setDescription("Compact SUV");
        car13.setBrand("Jeep");
        car13.setModel("2022");
        car13.setPrice(new BigDecimal("35000.00"));
        car13.setColor("Green");
        car13.setMotorType("Gasoline");
        car13.setPower(271);
        car13.setPlaceNumber(5);
        car13.setStatus(Car.Status.Pinned);
        car13.setType("SUV");
        carRepository.save(car13);

        Car car14 = new Car();
        car14.setName("Sorento");
        car14.setDescription("Mid-size crossover SUV");
        car14.setBrand("Kia");
        car14.setModel("2022");
        car14.setPrice(new BigDecimal("30000.00"));
        car14.setColor("Silver");
        car14.setMotorType("Gasoline");
        car14.setPower(191);
        car14.setPlaceNumber(7);
        car14.setStatus(Car.Status.NotPinned);
        car14.setType("SUV");
        carRepository.save(car14);

        Car car15 = new Car();
        car15.setName("X5");
        car15.setDescription("Mid-size luxury crossover SUV");
        car15.setBrand("BMW");
        car15.setModel("2022");
        car15.setPrice(new BigDecimal("60000.00"));
        car15.setColor("Black");
        car15.setMotorType("Gasoline");
        car15.setPower(335);
        car15.setPlaceNumber(5);
        car15.setStatus(Car.Status.Pinned);
        car15.setType("SUV");
        carRepository.save(car15);

        // Insérer des images
        Image image1 = new Image();
        image1.setCar(car1);
        image1.setUrl("https://cdn.motor1.com/images/mgl/7zVRk/s3/2021-mercedes-benz-c-class-rendering.jpg");
        imageRepository.save(image1);

        Image image2 = new Image();
        image2.setCar(car2);
        image2.setUrl("https://www.tesla.com/sites/default/files/modelsx-new/social/model-s-hero-social.jpg");
        imageRepository.save(image2);

        Image image3 = new Image();
        image3.setCar(car3);
        image3.setUrl("https://cdn.motor1.com/images/mgl/MelzL/s3/2022-ford-mustang.jpg");
        imageRepository.save(image3);

        Image image4 = new Image();
        image4.setCar(car4);
        image4.setUrl("https://cdn.motor1.com/images/mgl/GJ0N1/s3/2022-honda-civic.jpg");
        imageRepository.save(image4);

        Image image5 = new Image();
        image5.setCar(car5);
        image5.setUrl("https://cdn.motor1.com/images/mgl/0x0LQ/s3/2022-toyota-camry.jpg");
        imageRepository.save(image5);

        Image image6 = new Image();
        image6.setCar(car6);
        image6.setUrl("https://www.tesla.com/sites/default/files/modelsx-new/social/model-3-hero-social.jpg");
        imageRepository.save(image6);

        Image image7 = new Image();
        image7.setCar(car7);
        image7.setUrl("https://cdn.motor1.com/images/mgl/1ABWQ/s3/2022-ford-f-150.jpg");
        imageRepository.save(image7);

        Image image8 = new Image();
        image8.setCar(car8);
        image8.setUrl("https://cdn.motor1.com/images/mgl/J7BWL/s3/2022-honda-accord.jpg");
        imageRepository.save(image8);

        Image image9 = new Image();
        image9.setCar(car9);
        image9.setUrl("https://cdn.motor1.com/images/mgl/WJwJ0/s3/2022-mazda-cx-5.jpg");
        imageRepository.save(image9);

        Image image10 = new Image();
        image10.setCar(car10);
        image10.setUrl("https://cdn.motor1.com/images/mgl/4x4bB/s3/2022-audi-q5.jpg");
        imageRepository.save(image10);

        Image image11 = new Image();
        image11.setCar(car11);
        image11.setUrl("https://cdn.motor1.com/images/mgl/l0r0k/s3/2022-bmw-3-series.jpg");
        imageRepository.save(image11);

        Image image12 = new Image();
        image12.setCar(car12);
        image12.setUrl("https://cdn.motor1.com/images/mgl/zx0k0/s3/2022-nissan-altima.jpg");
        imageRepository.save(image12);

        Image image13 = new Image();
        image13.setCar(car13);
        image13.setUrl("https://cdn.motor1.com/images/mgl/9x6JL/s3/2022-jeep-cherokee.jpg");
        imageRepository.save(image13);

        Image image14 = new Image();
        image14.setCar(car14);
        image14.setUrl("https://cdn.motor1.com/images/mgl/kJVJQ/s3/2022-kia-sorento.jpg");
        imageRepository.save(image14);

        Image image15 = new Image();
        image15.setCar(car15);
        image15.setUrl("https://cdn.motor1.com/images/mgl/BXWzV/s3/2022-bmw-x5.jpg");
        imageRepository.save(image15);

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

