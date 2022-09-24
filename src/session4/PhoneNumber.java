package session4;

import java.util.ArrayList;

public class PhoneNumber {
        public String name;
        ArrayList<String> phone;

        public PhoneNumber(String name, String phone) {
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public ArrayList<String> getPhone() {
                return phone;
        }

        public void setPhone(ArrayList<String> phone) {
                this.phone = phone;
        }
}
