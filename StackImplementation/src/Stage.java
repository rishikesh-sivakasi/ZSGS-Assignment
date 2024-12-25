class Stage {
    private int level;
    private int choice;
    private static boolean isTamil = false;

    Stage(int level, int choice){
        this.level = level;
        this.choice = choice;
    }
    public int getLevel() {
        return level;
    }
    public int getChoice() {
        return choice;
    }
    public boolean isTamil() {
        return isTamil;
    }
    public void setTamil(boolean tamil) {
        isTamil = tamil;
    }

}
