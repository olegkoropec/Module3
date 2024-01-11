package passenger;

import java.util.Objects;

public class User {
    String gender;
    String name;
    String surname;
    String age;
    String country;
    String email;

    public User(String gender, String name, String surname, String age, String country, String email) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(gender, user.gender) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(age, user.age) && Objects.equals(country, user.country) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, surname, age, country, email);
    }

    @Override
    public String toString() {
        return  gender + " " +  name + " " + surname + ". Ми знаємо, що ви народилися " + age
                + " і ви з " + country + ". Ваша електронна адреса: " + email
                + ". Ви коректно відповіли на всі питання. Вітаємо.";
    }
}
