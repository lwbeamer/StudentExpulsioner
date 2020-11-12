public class Main {

    public static int beerBottles;

    public static void main(String[] args) {
        beerBottles = (int) (Math.random() * 4);
        boolean ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON;

        ROBOTECHNIKI = strToBool(args[0]);
        IVTESHNIKI = strToBool(args[1]);
        SPPOSHNIKI = strToBool(args[2]);
        RANDOM = strToBool(args[3]);
        FULL_MOON = strToBool(args[4]);

        System.out.println("Роботехники: " + ROBOTECHNIKI);
        System.out.println("Ивэтэшники: " + IVTESHNIKI);
        System.out.println("Сппошники: " + SPPOSHNIKI);
        System.out.println("Фактор рандома: " + RANDOM);
        System.out.println("Полнолуние: " + FULL_MOON);
        System.out.println("Бутылок пива: " + beerBottles+"\n");

        Student rob1 = new Student("Ракитин Егор Олегович", Type.ROBO,false,true);
        Student rob2 = new Student("Балтабаев Дамир Темиржанович", Type.ROBO,false,true);
        Student rob3 = new Student("Цаль Виталий Олегович", Type.ROBO,true,true);
        Student ivt1 = new Student("Сидорович Владимир Иванович", Type.IVT,true,true);
        Student ivt2 = new Student("Нуруллаев Даниил Романович", Type.IVT,false,true);
        Student ivt3 = new Student("Шевцов Алексей Анатольевич", Type.IVT,false,true);
        Student spp1 = new Student("Осипов Василий Васильевич", Type.SPPO,false,true);
        Student spp2 = new Student("Кошкарбаев Никита Юрьевич", Type.SPPO,false,true);
        Student spp3 = new Student("Фридкин Даниил Валерьевич", Type.SPPO,false,true);

        Expeller expeller = new Expeller(ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);

        expeller.expell(rob1);
        expeller.expell(rob2);
        expeller.expell(rob3);
        expeller.expell(ivt1);
        expeller.expell(ivt2);
        expeller.expell(ivt3);
        expeller.expell(spp1);
        expeller.expell(spp2);
        expeller.expell(spp3);

    }
    public static boolean strToBool(String str){
        if (str.equals("true"))
            return true;
        else
            return false;
    }
}
