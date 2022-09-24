package session4;

public abstract class Phone {
        public String name;
        public String phone;
        public String oldPhone;
        public String newPhone;

        public abstract void insertPhone(String name, String phone);
        public abstract void removePhone(String name);
        public abstract void updatePhone(String name, String oldPhone, String newPhone);
        public abstract void searchPhone(String name);
        public abstract void sort();

}
