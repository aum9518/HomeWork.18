public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Manas Abdugani uulu",27,'M');
        Person person2 = new Person("Jana Jusupova",25,'F');
        Person person3 = new Person("Kylych Koshbakov",16,'M');
        Person person4 = new Person("Jiyde Bakytova",20,'F');
        Person person5 = new Person("Musa Tilekov",30,'M');
        Person person6 = new Person("Juma Ulanbekov",24,'M');
        Person person7 = new Person("Janybek Koshokov",29,'M');
        Person person8 = new Person("Jyldyz Borubaev",21,'F');
        Person person9 = new Person("Bek Israilov",34,'M');
        Person person10 = new Person("Mirgul Kubanychbekov",31,'F');

        Person[] family1 = {person1,person2,person3,person4,person5};
        House house = new House(40,1200,400,family1);
        System.out.println(house);
        house.utilityService();
        Person[] family3 = {person9,person10};
        Person[] family2 = {person6,person7,person8};
        Appartment appartment = new Appartment(4000,50,300,200,family2);
        System.out.println(appartment);
        appartment.apartmentFee();
        appartment.utilityService();
        Hotel hotel =new Hotel(4000,family3);
        System.out.println(hotel);
        hotel.feeOfNumber();










    }
}