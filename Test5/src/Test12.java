public class Test12 {
    public boolean state = false;

    public void changeState(boolean state) {
        this.state = state;
    }

    protected void finalize() throws Throwable {
        if (state) {
            System.out.println("----满的，有问题---------");
            throw new Throwable("状态不为空!");
        } else {
            System.out.println("----空的，没问题---------");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        new Test12();
        System.gc();
        System.runFinalization();
        new Test12().changeState(true);
        System.gc();
        System.runFinalization();
    }    /**     * 运行结果		----空的，没问题---------		----满的，有问题---------	 */
}
