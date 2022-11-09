class Bridge {

   public native static long gcdOfTwo(long first, long second);

   static {
        System.loadLibrary("legacybridge");
  }
}
