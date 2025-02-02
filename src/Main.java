public class Main {
    public static void main(String[] args) {

        ITworker admin = new Admin("Noel","noelgal@gmail.com");
        ITworker developer = new Developer("KAM","kam@gmail.com","java");
        ITworker tester = new Tester("Dave","dave123@gmail.com");

        admin.login();
        admin.performDuties();

        developer.login();
        developer.performDuties();

        tester.login();
        tester.performDuties();

        admin.logout();
        developer.logout();
        tester.logout();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        PaymentProcessor paymentProcessor = new PayPalProcessor();
        PaymentService paymentService = new PaymentService(paymentProcessor);
        paymentService.makePayment(400.0);
        paymentService.makeRefund(30.2);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        CustomerManagerSql customerManagerSql = new CustomerManagerSql(new OracleDal());
        customerManagerSql.Add();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        Worker worker = new Worker();
        worker.Eat();
        worker.Work();

        OutSourceWorker outSourceWorker = new OutSourceWorker();
        outSourceWorker.Work();

        RobotWorker robotWorker = new RobotWorker();
        robotWorker.Work();


/*
       Student student1 = new Student("kam",5,2.2f,24);
        Student student2 = new Student("kseniia",3,2.9f,26);
        student1.setName("erkam yaman");
        System.out.println(student1.getName());

        Person person1 = new Person("Kseniia",26);
        Person person2 = new Programmer("Kam",24,"Javascript",1);
        person2.introduce();
        person1.introduce();

        Teacher teacher = new Teacher("JASON");
        teacher.assignHomework(student1);

        Sum sum = new Sum();
     System.out.println(sum.sum(1,2));
     System.out.println(sum.sum(1,3,4));
Animal animal = new Animal();
Cat cat = new Cat();
cat.makeSound();
animal.makeSound();

*/

/*
     TeacherCreditManager teacherLoan = new TeacherCreditManager();
     teacherLoan.calculateLoan();
     LoanUI loanUI = new LoanUI();
     loanUI.creditCalc(teacherLoan);
*/
/*
        BaseLogger bl = new BaseLogger();
        bl.Logger("hello");
        DatabaseLogger  dl = new DatabaseLogger();
        dl.Logger("hey");
        EmailLogger el = new EmailLogger();
        el.Logger("sent");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(),new DatabaseLogger(),new FileLogger()};
for (BaseLogger log:loggers){
    log.Logger("logging");


}

        CustomerManager cm = new CustomerManager(dl);
        cm.add();
*/

    /*    System.out.println("Hello");
        int money = 20;
        money = 40;
        float f = 10.5f;
        long l = 100000L;
        char abc = 'A';
        boolean isAllowed = true;
        System.out.println("Money: " + money);
        if (isAllowed) {
            System.out.println(abc);
        } else {
            System.out.println("not allowed");
        }
        int[] grades = {0, 5, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int grade : grades) {
            System.out.println(grade * 10);

        }

        MyClass classOne = new MyClass();
        System.out.println(classOne.x); */
       /* String Kam = new String("Erkam Yaman");
        System.out.println(Kam);
        System.out.println(Kam.length());
        System.out.println(Kam.indexOf('k'));
        System.out.println(Kam.charAt(0));
        System.out.println(Kam.substring(6));

        String str = "Hello, World! ";
        System.out.println(str);
        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length); // 15

        // Trimmed string
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed); // "Hello, World!"

        // Substring
        String sub = trimmed.substring(7);
        System.out.println("Substring: " + sub); // "World!"

        // Upper case
        String upper = trimmed.toUpperCase();
        System.out.println("Upper case: " + upper); // "HELLO, WORLD!"

        // Replace
        String replaced = trimmed.replace("World", "Java");
        System.out.println("Replaced: " + replaced); // "Hello, Java!"

        // Split
        String[] parts = trimmed.split(", ");
        System.out.println("Split: " + java.util.Arrays.toString(parts));*/
        /*// backlash
        System.out.println("C:\\Program Files\\Java");

        // new line
        System.out.println("Hello\nWorld!");*/
        /*int[] intArray;
        String[] stringArray;

        intArray = new int[5];
        stringArray = new String[10];

        int[] intArrayNew = {1, 2, 3, 4, 5};
        String[] stringArrayNew = {"Hello", "World"};*/
     /*   final float PI = 3.14F;

        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(person1.name);
        System.out.println(person2.age);
        System.out.println(person1.nationality);
        person1.name="kseniia";
        System.out.println(person1.name);
        System.out.println(person1.nationality);
        person1.myPublicMethod();
        Person.myStaticMethod();*/
        }
}

