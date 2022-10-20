class Main {
    public boolean isRobotBounded(String s) {
        if(s.length()==0)return false;
        int x=0;
        int y=0;
        String direc="North";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='G')
            {
                if(direc.equals("North"))y+=1;
                else if(direc.equals("South"))y-=1;
                else if(direc.equals("East"))x+=1;
                else if(direc.equals("West"))x-=1;
            }
            else if(s.charAt(i)=='L')
            {
                if(direc.equals("North"))direc="West";
                else if(direc.equals("West"))direc="South";
                else if(direc.equals("South"))direc="East";
                else if(direc.equals("East"))direc="North";
            }
            else if(s.charAt(i)=='R')
            {
                if(direc.equals("North"))direc="East";
                else if(direc.equals("East"))direc="South";
                else if(direc.equals("South"))direc="West";
                else if(direc.equals("West"))direc="North";
            }
        }
        if(x==0&&y==0)return true;
        if(direc.equals("North"))return false;
        return true;
        
    }
}
