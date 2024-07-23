public class CustomerManagerSql {
    ICustomerDal iCustomerDal;

    public CustomerManagerSql(ICustomerDal iCustomerDal){
        this.iCustomerDal = iCustomerDal;
    }

    public void Add(){
        iCustomerDal.Add();
    }

}
