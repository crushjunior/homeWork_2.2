package hw3;

    public class Human {
        private int yearOfBirth;
        String name;
        private String town;
        String job;

        public Human(String name, String town, String job, int yearOfBirth) {
            if (name == null) {
                this.name = "Информация не указана";
            } else {
                this.name = name;
            }

            if (town == null) {
                this.town = "Информация не указана";
            } else {
                this.town = town;
            }

            if (job == null) {
                this.job = "Информация не указана";
            } else {
                this.job = job;
            }

            if (yearOfBirth < 0) {
                this.yearOfBirth = 0;
            } else {
                this.yearOfBirth = yearOfBirth;
            }
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public String getTown() {
            return town;
        }

        public void setYearOfBirth(int yearOfBirth) {
            if (yearOfBirth < 0) {
                this.yearOfBirth = 0;
            } else {
                this.yearOfBirth = yearOfBirth;
            }
        }


        public void setTown(String town) {
            if (town == null) {
                this.town = "Информация не указана";
            } else {
                this.town = town;
            }
        }

        public void hello() {
            System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + getTown() + ". " + "Я родился(лась) в " + getYearOfBirth() + " году. Я работаю на должности " + job + ". " + "Будем знакомы!");
        }
    }
