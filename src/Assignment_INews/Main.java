package Assignment_INews;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{2, 3, 5};
        News a = new News(1, "abc", "22/12/2020", "Toto", "abc1");
        a.AverageRate= a.Calculate(arr[0],
                arr[1],
                arr[2]);
        a.display();
    }
}