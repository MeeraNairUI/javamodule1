package eenum;

public class TestEnum {
     public static void main(String[] args) {
    	 DayOfWeek today = DayOfWeek.SATURDAY;
    	 System.out.println("Today is "+ today.getName());
    	 
    	 switch(today) {
    	 case MONDAY:
    		 System.out.println("Work Hard");
    		 break;
    	 case TUESDAY:
    	      System.out.println("Work little more");
    	      break;
    	 case WEDNESDAY:
    		 System.out.println("Work workn little more");
    		 break;
    	 case THURSDAY:
    		 System.out.println("Work work more,WEEKEND is around soon");
    		 break;
    	 case FRIDAY:
    		 System.out.println("yeah weekend has arrived,party hard");
    		 break;
    	 case SATURDAY:
    		 System.out.println("enjoy morning shopping");
    		 break;
    	 case SUNDAY:
    		 System.out.println("do all cleaning works,snooooooozzzze");
    		 break;
    	 }
     }
}
