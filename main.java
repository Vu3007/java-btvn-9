import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<movies>arrMovies=new ArrayList<>();

        movies movies1=new movies(1,"hai","a",10,30000);
        movies movies2=new movies(2,"tinh cam","b",1,40000);
        movies movies3=new movies(3,"hanh dong","c",4,50000);
        movies movies4=new movies(4,"kinh di","d",6,60000);
        movies movies5=new movies(5,"gay can","e",18,800000);
        arrMovies.add(movies1);
        arrMovies.add(movies2);
        arrMovies.add(movies3);
        arrMovies.add(movies4);
        arrMovies.add(movies5);
        for (int i=0;i<arrMovies.size();i++){
            System.out.println(arrMovies.get(i));
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten phim: ");
        String findName= sc.nextLine();
        for (int i=0;i<arrMovies.size();i++){
            if (arrMovies.get(i).getName().equalsIgnoreCase(findName)){
                System.out.println("Phim can tim la: "+arrMovies.get(i));
            }
        }

        System.out.println("Nhap id phim: ");
        int findId= sc.nextInt();
        for (int i=0;i<arrMovies.size();i++){
            if (arrMovies.get(i).getId()==findId){
                System.out.println("Phim can tim la: "+arrMovies.get(i));
            }
        }

        System.out.println("Nhap id phim can xoa: ");
        findId= sc.nextInt();

        for (int i=0;i<= arrMovies.size();i++){
            if (arrMovies.get(i).getId()<findId){
                System.out.println("Phim can xoa la: "+arrMovies.get(i));
            }
            System.out.println("Phim con lai la: "+ arrMovies.remove(findId));
        }



        for (int i=0;i< arrMovies.size();i++){
            if (arrMovies.get(i).getPrice()>=50000){
                if(arrMovies.get(i).getPrice()<100000){
                }
                System.out.println("San pham tu 50000 den 100000 la: "+arrMovies.get(i));
            }
            }

        }
    }

