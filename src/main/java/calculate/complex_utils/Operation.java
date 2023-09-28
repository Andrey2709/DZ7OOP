package calculate.complex_utils;

public enum Operation {



    PLUS("+"){public ComplexNumber apply(ComplexNumber number1, ComplexNumber number2){
        return new ComplexNumber(number1.getReal()+ number2.getReal(),
                number1.getImangenary()+ number2.getImangenary());
    }},
    MINUS("-"){public ComplexNumber apply(ComplexNumber number1, ComplexNumber number2){
        return new ComplexNumber(number1.getReal()-number2.getReal(),
                number1.getImangenary() - number2.getImangenary());
    }},
    DIVISION("/"){public ComplexNumber apply(ComplexNumber number1, ComplexNumber number2){
        return new ComplexNumber((number1.getReal()*number2.getReal() + number1.getImangenary() * number2.getImangenary())/((number2.getReal() * number2.getReal()) + (number2.getImangenary() * number2.getImangenary())) ,
                (number1.getReal()*number2.getReal() - number1.getImangenary()  * number2.getImangenary())/((number2.getReal() * number2.getReal()) + (number2.getImangenary() * number2.getImangenary())) );
    }},
    MILTIPLY("*"){public ComplexNumber apply(ComplexNumber number1, ComplexNumber number2){
        return new ComplexNumber(number1.getReal() * number2.getReal() - number1.getImangenary() * number2.getImangenary() ,
                number1.getReal() * number2.getImangenary() + number1.getImangenary() * number2.getReal());
    }};

    private  final String op;

    Operation(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    public  static  Operation getOperation(String s){
    for (Operation op : values()) {
        if(op.getOp().equals(s)){
            return op;
        }
    }
    throw  new IllegalArgumentException("No enum found with url: [" + s + "]");
}
    public abstract ComplexNumber apply(ComplexNumber number1, ComplexNumber number2);
}
