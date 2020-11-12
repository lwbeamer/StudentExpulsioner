public class Expeller {
    private boolean ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON;

    public Expeller(boolean ROBOTECHNIKI, boolean IVTESHNIKI, boolean SPPOSHNIKI, boolean RANDOM, boolean FULL_MOON) {
        this.ROBOTECHNIKI = ROBOTECHNIKI;
        this.IVTESHNIKI = IVTESHNIKI;
        this.SPPOSHNIKI = SPPOSHNIKI;
        this.RANDOM = RANDOM;
        this.FULL_MOON = FULL_MOON;
    }

    public void expell(Student student){
        int i;
        switch (student.getType()){
            case IVT:{
                if (IVTESHNIKI) {
                    if (RANDOM) {
                        i = (int) (Math.random() * 2);
                        if (i == 0) {
                            checkDebtIvt(student);
                            break;
                        } else {
                            System.out.println(student.getName());
                            System.out.println("Ивэтэшник");
                            System.out.println("Отчислен");
                            System.out.println("По воле случая. Выпала решка\n");
                            break;
                        }
                    } else {
                        checkDebtIvt(student);
                        break;
                    }
                }
                else {
                    if (Main.beerBottles > 0) {
                        Main.beerBottles -= 1;
                        System.out.println(student.getName());
                        System.out.println("Ивэтэшник");
                        System.out.println("Студенту сегодня повезло и вместо отчисления ему выдано пиво!\n");
                        break;
                    } else {
                        System.out.println(student.getName());
                        System.out.println("Ивэтэшник");
                        System.out.println("Студента сегодня не отчислили, но пиво закончилось(\n");
                    }
                }
                    break;
            }
            case ROBO:{
                if (ROBOTECHNIKI) {
                    if (student.hasProgrammingDebt()) {
                        System.out.println(student.getName());
                        System.out.println("Роботехник");
                        System.out.println("Отчислен");
                        System.out.println("Долг по программированию\n");
                        break;
                    } else {
                        System.out.println(student.getName());
                        System.out.println("Роботехник");
                        System.out.println("Не отчислен");
                        System.out.println("Долгов нет\n");
                        break;
                    }
                }
                else {
                    if (Main.beerBottles > 0) {
                        Main.beerBottles -= 1;
                        System.out.println(student.getName());
                        System.out.println("Роботехник");
                        System.out.println("Студенту сегодня повезло и вместо отчисления ему выдано пиво!\n");
                        break;
                    } else {
                        System.out.println(student.getName());
                        System.out.println("Роботехник");
                        System.out.println("Студента сегодня не отчислили, но пиво закончилось(\n");
                    }
                }
                break;
            }
            case SPPO:{
                if (SPPOSHNIKI)
                    if (RANDOM) {
                        i = (int) (Math.random() * 2);
                        if (i == 0) {
                            checkDebtSppo(student);
                            break;
                        }
                        else {
                            System.out.println(student.getName());
                            System.out.println("Сппошник");
                            System.out.println("Отчислен");
                            System.out.println("По воле случая. Выпала решка\n");
                            break;
                        }
                    }
                    else {
                        if (FULL_MOON) {
                            System.out.println(student.getName());
                            System.out.println("Сппошник");
                            System.out.println("Студент отчислен");
                            System.out.println("Сегодня полнолуние!\n");
                            break;
                        } else {
                            checkDebtSppo(student);
                            break;
                        }
                    }
                else {
                    if (Main.beerBottles > 0) {
                        Main.beerBottles -= 1;
                        System.out.println(student.getName());
                        System.out.println("Сппошник");
                        System.out.println("Студенту сегодня повезло и вместо отчисления ему выдано пиво!\n");
                        break;
                    } else {
                        System.out.println(student.getName());
                        System.out.println("Сппошник");
                        System.out.println("Студента сегодня не отчислили, но пиво закончилось(\n");
                    }
                }
                break;
            }
            default:
                System.out.println("Похоже студент не учится на ВТ...\n");
                break;
        }
    }

    public void checkDebtIvt(Student student){
        if (student.hasProgrammingDebt() || student.hasCsbasicsDebt()){
            System.out.println(student.getName());
            System.out.println("Ивэтэшник");
            System.out.println("Отчислен");
            if (student.hasProgrammingDebt() && student.hasCsbasicsDebt()) {
                System.out.println("Долг по программированию и ОПД\n");
            }
            else if (student.hasProgrammingDebt()){
                System.out.println("Долг по программированию\n");
            }
            else if (student.hasCsbasicsDebt()){
                System.out.println("Долг по ОПД\n");
            }
        }
        else {
            System.out.println(student.getName());
            System.out.println("Роботехник");
            System.out.println("Не отчислен");
            System.out.println("Долгов нет\n");
        }
    }

    public void checkDebtSppo(Student student){
        if (student.hasProgrammingDebt() || student.hasCsbasicsDebt()){
            System.out.println(student.getName());
            System.out.println("Сппошник");
            System.out.println("Отчислен");
            if (student.hasProgrammingDebt() && student.hasCsbasicsDebt()) {
                System.out.println("Долг по программированию и ОПД\n");
            }
            else if (student.hasProgrammingDebt()){
                System.out.println("Долг по программированию\n");
            }
            else if (student.hasCsbasicsDebt()){
                System.out.println("Долг по ОПД\n");
            }
        }
        else {
            System.out.println(student.getName());
            System.out.println("Сппошник");
            System.out.println("Не отчислен");
            System.out.println("Долгов нет\n");
        }
    }
}
