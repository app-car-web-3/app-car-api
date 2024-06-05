package com.examen.App.web3.db;

import com.examen.App.web3.model.*;
import com.examen.App.web3.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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

    @Autowired
    private BrandRepository brandRepository;



    @Override
    public void run(String... args) throws Exception {
        // Create and save Brand entities with images
        Brand brand1 = new Brand();
        brand1.setName("Mercedes-Benz");
        brand1.setDescription("Luxury vehicle manufacturer");
        Image brandImage1 = new Image();
        brandImage1.setName("Mercedes-Benz Logo");
        brandImage1.setUrl("https://seeklogo.com/images/M/mercedes-benz-logo-387C1B084B-seeklogo.com.png");
        imageRepository.save(brandImage1);
        brand1.setImageId(brandImage1);
        brandRepository.save(brand1);

        Brand brand2 = new Brand();
        brand2.setName("Tesla");
        brand2.setDescription("Electric vehicle manufacturer");
        Image brandImage2 = new Image();
        brandImage2.setName("Tesla Logo");
        brandImage2.setUrl("https://static.vecteezy.com/system/resources/previews/020/336/735/original/tesla-logo-tesla-icon-transparent-png-free-vector.jpg");
        imageRepository.save(brandImage2);
        brand2.setImageId(brandImage2);
        brandRepository.save(brand2);

        Brand brand3 = new Brand();
        brand3.setName("Ford");
        brand3.setDescription("American multinational automaker");
        Image brandImage3 = new Image();
        brandImage3.setName("Ford Logo");
        brandImage3.setUrl("https://freelogopng.com/images/all_img/1692441097ford-logo-black.png");
        imageRepository.save(brandImage3);
        brand3.setImageId(brandImage3);
        brandRepository.save(brand3);

        Brand brand4 = new Brand();
        brand4.setName("Honda");
        brand4.setDescription("Japanese public multinational conglomerate");
        Image brandImage4 = new Image();
        brandImage4.setName("Honda Logo");
        brandImage4.setUrl("https://freelogopng.com/images/all_img/1686370754honda-motorcycle-logo-black.png");
        imageRepository.save(brandImage4);
        brand4.setImageId(brandImage4);
        brandRepository.save(brand4);

        Brand brand5 = new Brand();
        brand5.setName("Toyota");
        brand5.setDescription("Japanese multinational automotive manufacturer");
        Image brandImage5 = new Image();
        brandImage5.setName("Toyota Logo");
        brandImage5.setUrl("https://freelogopng.com/images/all_img/1686110052toyota-logo-black.png");
        imageRepository.save(brandImage5);
        brand5.setImageId(brandImage5);
        brandRepository.save(brand5);

        Brand brand6 = new Brand();
        brand6.setName("Mazda");
        brand6.setDescription("Japanese automaker");
        Image brandImage6 = new Image();
        brandImage6.setName("Mazda Logo");
        brandImage6.setUrl("https://i.pinimg.com/564x/77/36/58/77365871976e13fbc666d2bb5dee294e.jpg");
        imageRepository.save(brandImage6);
        brand6.setImageId(brandImage6);
        brandRepository.save(brand6);

        Brand brand7 = new Brand();
        brand7.setName("Audi");
        brand7.setDescription("German automobile manufacturer");
        Image brandImage7 = new Image();
        brandImage7.setName("Audi Logo");
        brandImage7.setUrl("https://i.pinimg.com/564x/5a/d9/5e/5ad95ed5c0fbe3013e2dcf9baa76385e.jpg");
        imageRepository.save(brandImage7);
        brand7.setImageId(brandImage7);
        brandRepository.save(brand7);

        Brand brand8 = new Brand();
        brand8.setName("BMW");
        brand8.setDescription("German multinational company");
        Image brandImage8 = new Image();
        brandImage8.setName("BMW Logo");
        brandImage8.setUrl("https://freelogopng.com/images/all_img/1686386725bmw-logo-png-black-and-white.png");
        imageRepository.save(brandImage8);
        brand8.setImageId(brandImage8);
        brandRepository.save(brand8);

        Brand brand9 = new Brand();
        brand9.setName("Nissan");
        brand9.setDescription("Japanese multinational automobile manufacturer");
        Image brandImage9 = new Image();
        brandImage9.setName("Nissan Logo");
        brandImage9.setUrl("https://i.pinimg.com/564x/d6/e1/5e/d6e15e493368d88b51f1474a5165f8de.jpg");
        imageRepository.save(brandImage9);
        brand9.setImageId(brandImage9);
        brandRepository.save(brand9);

        Brand brand10 = new Brand();
        brand10.setName("Jeep");
        brand10.setDescription("American automobile marque");
        Image brandImage10 = new Image();
        brandImage10.setName("Jeep Logo");
        brandImage10.setUrl("https://i.pinimg.com/564x/29/b8/c4/29b8c461f054648c7cc2304fd363f360.jpg");
        imageRepository.save(brandImage10);
        brand10.setImageId(brandImage10);
        brandRepository.save(brand10);

        Brand brand11 = new Brand();
        brand11.setName("Kia");
        brand11.setDescription("South Korean multinational automotive manufacturer");
        Image brandImage11 = new Image();
        brandImage11.setName("Kia Logo");
        brandImage11.setUrl("https://i.pinimg.com/736x/66/00/10/66001073246ee1203e62da9ef48b2d54.jpg");
        imageRepository.save(brandImage11);
        brand11.setImageId(brandImage11);
        brandRepository.save(brand11);

        Brand brand12 = new Brand();
        brand12.setName("Hyundai");
        brand12.setDescription("South Korean multinational automotive manufacturer");
        Image brandImage12 = new Image();
        brandImage12.setName("Hyundai Logo");
        brandImage12.setUrl("https://i.pinimg.com/564x/74/77/4c/74774c8992f9632bf05cbb8196a4eafd.jpg");
        imageRepository.save(brandImage12);
        brand12.setImageId(brandImage12);
        brandRepository.save(brand12);

// Create and save Car entities with images
        Car car1 = new Car();
        car1.setName("C-Class");
        car1.setDescription("Compact executive car");
        car1.setBrandId(brand1);
        car1.setModel("2022");
        car1.setPrice(new BigDecimal("40000.00"));
        car1.setColor("Black");
        car1.setMotorType("Gasoline");
        car1.setPower(255);
        car1.setPlaceNumber(5);
        car1.setStatus(Car.Status.Pinned);
        car1.setType("Sedan");
        Image carImage1 = new Image();
        carImage1.setName("Mercedes-Benz C-Class");
        carImage1.setUrl("https://i.pinimg.com/564x/a9/01/58/a9015809fe2dbfea60cc912efb396b23.jpg");
        imageRepository.save(carImage1);
        car1.setImageId(carImage1);
        carRepository.save(car1);

        Car car2 = new Car();
        car2.setName("Model S");
        car2.setDescription("All-electric sedan");
        car2.setBrandId(brand2);
        car2.setModel("2022");
        car2.setPrice(new BigDecimal("79990.00"));
        car2.setColor("Red");
        car2.setMotorType("Electric");
        car2.setPower(670);
        car2.setPlaceNumber(5);
        car2.setStatus(Car.Status.NotPinned);
        car2.setType("Sedan");
        Image carImage2 = new Image();
        carImage2.setName("Tesla Model S");
        carImage2.setUrl("https://i.pinimg.com/564x/d5/fc/9e/d5fc9edc13aba9bccfc0d782b2816efa.jpg");
        imageRepository.save(carImage2);
        car2.setImageId(carImage2);
        carRepository.save(car2);

        Car car3 = new Car();
        car3.setName("Mustang");
        car3.setDescription("Sporty coupe");
        car3.setBrandId(brand3);
        car3.setModel("2022");
        car3.setPrice(new BigDecimal("55000.00"));
        car3.setColor("Blue");
        car3.setMotorType("Gasoline");
        car3.setPower(450);
        car3.setPlaceNumber(4);
        car3.setStatus(Car.Status.Pinned);
        car3.setType("Coupe");
        Image carImage3 = new Image();
        carImage3.setName("Ford Mustang");
        carImage3.setUrl("https://i.pinimg.com/564x/af/40/58/af4058dfc123cfa613553fc97351d230.jpg");
        imageRepository.save(carImage3);
        car3.setImageId(carImage3);
        carRepository.save(car3);

        Car car4 = new Car();
        car4.setName("Civic");
        car4.setDescription("Compact car");
        car4.setBrandId(brand4);
        car4.setModel("2023");
        car4.setPrice(new BigDecimal("22000.00"));
        car4.setColor("White");
        car4.setMotorType("Gasoline");
        car4.setPower(158);
        car4.setPlaceNumber(5);
        car4.setStatus(Car.Status.NotPinned);
        car4.setType("Sedan");
        Image carImage4 = new Image();
        carImage4.setName("Honda Civic");
        carImage4.setUrl("https://i.pinimg.com/564x/c7/f3/df/c7f3dfca1f08424aeecd736caa51618a.jpg");
        imageRepository.save(carImage4);
        car4.setImageId(carImage4);
        carRepository.save(car4);

        Car car5 = new Car();
        car5.setName("Camry");
        car5.setDescription("Mid-size car");
        car5.setBrandId(brand5);
        car5.setModel("2023");
        car5.setPrice(new BigDecimal("25000.00"));
        car5.setColor("Gray");
        car5.setMotorType("Hybrid");
        car5.setPower(208);
        car5.setPlaceNumber(5);
        car5.setStatus(Car.Status.Pinned);
        car5.setType("Sedan");
        Image carImage5 = new Image();
        carImage5.setName("Toyota Camry");
        carImage5.setUrl("https://i.pinimg.com/564x/43/e8/8a/43e88a8ad09494989f4622ec04976e08.jpg");
        imageRepository.save(carImage5);
        car5.setImageId(carImage5);
        carRepository.save(car5);

        Car car6 = new Car();
        car6.setName("CX-5");
        car6.setDescription("Compact crossover SUV");
        car6.setBrandId(brand6);
        car6.setModel("2023");
        car6.setPrice(new BigDecimal("27000.00"));
        car6.setColor("Red");
        car6.setMotorType("Gasoline");
        car6.setPower(187);
        car6.setPlaceNumber(5);
        car6.setStatus(Car.Status.NotPinned);
        car6.setType("SUV");
        Image carImage6 = new Image();
        carImage6.setName("Mazda CX-5");
        carImage6.setUrl("https://www.groupe-parot.com/sites/zanzicar/files/inline-images/mazda-2_4.jpg");
        imageRepository.save(carImage6);
        car6.setImageId(carImage6);
        carRepository.save(car6);

        Car car7 = new Car();
        car7.setName("A4");
        car7.setDescription("Compact executive car");
        car7.setBrandId(brand7);
        car7.setModel("2023");
        car7.setPrice(new BigDecimal("39000.00"));
        car7.setColor("Black");
        car7.setMotorType("Gasoline");
        car7.setPower(201);
        car7.setPlaceNumber(5);
        car7.setStatus(Car.Status.Pinned);
        car7.setType("Sedan");
        Image carImage7 = new Image();
        carImage7.setName("Audi A4");
        carImage7.setUrl("https://i.pinimg.com/564x/94/42/8d/94428d7ab6f6ce60f821be3ef61adac9.jpg");
        imageRepository.save(carImage7);
        car7.setImageId(carImage7);
        carRepository.save(car7);

        Car car8 = new Car();
        car8.setName("3 Series");
        car8.setDescription("Compact executive car");
        car8.setBrandId(brand8);
        car8.setModel("2024");
        car8.setPrice(new BigDecimal("42000.00"));
        car8.setColor("White");
        car8.setMotorType("Gasoline");
        car8.setPower(255);
        car8.setPlaceNumber(5);
        car8.setStatus(Car.Status.NotPinned);
        car8.setType("Sedan");
        Image carImage8 = new Image();
        carImage8.setName("BMW 3 Series");
        carImage8.setUrl("https://i.pinimg.com/564x/b4/9f/ff/b49fff8a2abc3409ae935f4b05d8dd8c.jpg");
        imageRepository.save(carImage8);
        car8.setImageId(carImage8);
        carRepository.save(car8);

        Car car9 = new Car();
        car9.setName("Altima");
        car9.setDescription("Mid-size car");
        car9.setBrandId(brand9);
        car9.setModel("2022");
        car9.setPrice(new BigDecimal("24000.00"));
        car9.setColor("Gray");
        car9.setMotorType("Gasoline");
        car9.setPower(188);
        car9.setPlaceNumber(5);
        car9.setStatus(Car.Status.Pinned);
        car9.setType("Sedan");
        Image carImage9 = new Image();
        carImage9.setName("Nissan Altima");
        carImage9.setUrl("https://i.pinimg.com/564x/b7/15/76/b71576fd2379891670e720d699e2b32f.jpg");
        imageRepository.save(carImage9);
        car9.setImageId(carImage9);
        carRepository.save(car9);

        Car car10 = new Car();
        car10.setName("Wrangler");
        car10.setDescription("Compact SUV");
        car10.setBrandId(brand10);
        car10.setModel("2024");
        car10.setPrice(new BigDecimal("35000.00"));
        car10.setColor("Green");
        car10.setMotorType("Gasoline");
        car10.setPower(285);
        car10.setPlaceNumber(5);
        car10.setStatus(Car.Status.NotPinned);
        car10.setType("SUV");
        Image carImage10 = new Image();
        carImage10.setName("Jeep Wrangler");
        carImage10.setUrl("https://i.pinimg.com/564x/51/5f/d1/515fd1bb46b441c8ac0d9fb59d9e5b51.jpg");
        imageRepository.save(carImage10);
        car10.setImageId(carImage10);
        carRepository.save(car10);

        Car car11 = new Car();
        car11.setName("Sorento");
        car11.setDescription("Mid-size crossover SUV");
        car11.setBrandId(brand11);
        car11.setModel("2024");
        car11.setPrice(new BigDecimal("29000.00"));
        car11.setColor("Blue");
        car11.setMotorType("Gasoline");
        car11.setPower(191);
        car11.setPlaceNumber(5);
        car11.setStatus(Car.Status.Pinned);
        car11.setType("SUV");
        Image carImage11 = new Image();
        carImage11.setName("Kia Sorento");
        carImage11.setUrl("https://i.pinimg.com/564x/1a/01/75/1a01757d0abb20e02a026896e27eb24e.jpg");
        imageRepository.save(carImage11);
        car11.setImageId(carImage11);
        carRepository.save(car11);

        Car car12 = new Car();
        car12.setName("Tucson");
        car12.setDescription("Compact crossover SUV");
        car12.setBrandId(brand12);
        car12.setModel("2024");
        car12.setPrice(new BigDecimal("26000.00"));
        car12.setColor("Red");
        car12.setMotorType("Gasoline");
        car12.setPower(187);
        car12.setPlaceNumber(5);
        car12.setStatus(Car.Status.NotPinned);
        car12.setType("SUV");
        Image carImage12 = new Image();
        carImage12.setName("Hyundai Tucson");
        carImage12.setUrl("https://i.pinimg.com/564x/ef/87/f2/ef87f24022350809d129146ab0e5fff0.jpg");
        imageRepository.save(carImage12);
        car12.setImageId(carImage12);
        carRepository.save(car12);

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
        user1.setName("Alice");
        user1.setEmail("alice@example.com");
        user1.setPassword("password123");
        userRepository.save(user1);

        User user2 = new User();
        user2.setName("Bob");
        user2.setEmail("bob@example.com");
        user2.setPassword("password456");
        userRepository.save(user2);

        User user3 = new User();
        user3.setName("Charlie");
        user3.setEmail("charlie@example.com");
        user3.setPassword("password789");
        userRepository.save(user3);
    }
}

