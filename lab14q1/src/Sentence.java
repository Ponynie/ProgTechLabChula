class Sentence { 
    private String s; 
    public Sentence (String s) { 
        this.s = s; 
    } 
    // เขียน method find()
    public boolean find(String ss) {
        int pointer = 0 ;
        return find(ss , pointer);
    }
    public boolean find(String ss, int pointer) {
        //limiter = pointer + ss.length(); 
        if (pointer + ss.length() > s.length())
            return false;
        else if (!this.s.substring(pointer, pointer + ss.length()).equals(ss))
            return find(ss, pointer + 1);
        else
            return true;
    }
}