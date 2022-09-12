/**
 The Policy class hilds data about the policy.
*/
public class Policy
   {
      private int policyNumber;
      private String policyName;
      private String firstName;
      private String lastName;
      private int holderAge;
      private String smokerStatus;
      private double height;
      private double weight;
      
      /**
       Constructor
       @param num The policy number
       @param pName The policy name
       @param fName The first name
       @param lName The last name
       @param age The age
       @param sStatus The Smoker Status
       @param hgt The height
       @param wgt The weight
      */
      public Policy(int num, String pName, String fName, String lName, int age, String sStatus, double hgt, double wgt)
      {
         policyNumber = num;
         policyName = pName;
         firstName = fName;
         lastName = lName;
         holderAge = age;
         smokerStatus = sStatus;
         height = hgt;
         weight = wgt;
      }
      
      /**
       The setPolicyNumber sets the policy number
      */
      public void setPolicyNumber(int num) 
      {
         policyNumber = num;
      }
      
      /**
       The setPolicyName sets the policy name
      */
      public void setPolicyName(String pName) 
      {
         policyName = pName;
      }
      
      /**
       The setFirstName sets the policy first name
      */
      public void setFirstName(String fName) 
      {
         firstName = fName;
      }
      
      /**
       The setLastName sets the policy last name
      */
      public void setLastName(String lName) 
      {
         lastName = lName;
      }
      
      /**
       The setHolderAge sets the policy holders age
      */
      public void setHolderAge(int age) 
      {
         holderAge = age;
      }
      
      /**
       The setSmokerStatus sets the policy holder smoker status
      */
      public void setSmokerStatus(String sStatus) 
      {
         smokerStatus = sStatus;
      }
      
      /**
       The setHeight sets the holder height
      */
      public void setHeight(double hgt) 
      {
         height = hgt;
      }
      
      /**
       The setWeight Sets the holder weight
      */
      public void setWeight(double wgt) 
      {
         weight = wgt;
      }
      
      /**
       getPolicyNumber method
       @return the policy number
      */
      public int getPolicyNumber() 
      {
         return policyNumber;
      }
      
      /**
       getPolicyName method
       @return the policy name
      */
      public String getPolicyName()
      {
         return policyName;
      }
      
      /**
       getFirstName method
       @return the first name
      */
      public String getFirstName()
      {
         return firstName;
      }
      
      /**
       getLastName method
       @return the last name
      */
      public String getLastName()
      {
         return lastName;
      }
      
      /**
       getHolderAge method
       @return the holders age
      */
      public int getHolderAge()
      {
         return holderAge;
      }
      
      /**
       getSmokerStatus method
       @return the smokers satus
      */
      public String getSmokerStatus()
      {
         return smokerStatus;
      }
      
      /**
       getHeight method
       @return the height
      */
      public double getHeight()
      {
         return height;
      }
      
      /**
       getWeight method
       @return the weight
      */
      public double getWeight()
      {
         return weight;
      }
      
   }
