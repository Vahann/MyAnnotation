import annotation.CustomerDto;
import annotation.Validator;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        CustomerDto customerDto = new CustomerDto("po", "mail@mail.", "2020-07-29", 1);

        Validator.validate(customerDto);


    }
}
