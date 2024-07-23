public class Worker implements IWorkable , ILunch {
    @Override
    public void Work() {
        System.out.println("worker is working");
    }

    @Override
    public void Eat() {
        System.out.println("Worker is eating");
    }
}
