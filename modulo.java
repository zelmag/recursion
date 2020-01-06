// 14/7 14 is dividend, 7 is the divisor
public static int modulo(int dividend, int divisor){
  if(divisor == 0){
    return -1; //cant divide by 0
  }
  if(dividend < divisor){
    return dividend;
  }
  return modulo(dividend - divisor, divisor);
  }
