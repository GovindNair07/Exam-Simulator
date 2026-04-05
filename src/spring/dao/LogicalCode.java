package spring.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import spring.hib.soft.Login;
import spring.hib.soft.Question;
import spring.hib.soft.Student;









public class LogicalCode
{
    private HibernateTemplate template;

    public HibernateTemplate getTemplate()
    {
        return template;
    }

    public void setTemplate(HibernateTemplate template)
    {
        this.template = template;
    }
    
    
     public ArrayList  getQuestions(String technoName)
    {
        ArrayList  list1=new ArrayList();
        
        if(technoName.equalsIgnoreCase("JAVA"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getQuestion());
         
        }
        }
        else if(technoName.equalsIgnoreCase("C"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getQuestion());
        }
        }
        
        
          return list1;
       
    }
    
    public List  getAnswers(String technoName)
    {
        ArrayList  list1=new ArrayList();
        
        if(technoName.equalsIgnoreCase("JAVA"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getCorrectOption());
        }
        }
        else if(technoName.equalsIgnoreCase("C"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getCorrectOption());
        }
        }
        
        
          return list1;
         
         
    }
    public List  getFirstChoice(String technoName)
    {
      ArrayList  list1=new ArrayList();
        
        if(technoName.equalsIgnoreCase("JAVA"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption1());
        }
        }
        else if(technoName.equalsIgnoreCase("C"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption1());
        }
        }
        
        
          return list1;
         
        
    }
    
    public List  getSecondChoice(String technoName)
    {
      ArrayList  list1=new ArrayList();
        
        if(technoName.equalsIgnoreCase("JAVA"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption2());
        }
        }
        else if(technoName.equalsIgnoreCase("C"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption2());
        }
        }
          return list1;
    }         
        
    
    
    
    public List  getThirdChoice(String technoName)
    {
      ArrayList  list1=new ArrayList();
        
        if(technoName.equalsIgnoreCase("JAVA"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption3());
        }
        }
        else if(technoName.equalsIgnoreCase("C"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption3());
        }
        }
          return list1;
    }         
    public List  getFourthChoice(String technoName)
    {
      ArrayList  list1=new ArrayList();
        
        if(technoName.equalsIgnoreCase("JAVA"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption4());
        }
        }
        else if(technoName.equalsIgnoreCase("C"))
        {
        List<Question> list = template.find("from Question where technology=?",technoName);
        for(Question q:list)
        {
            list1.add(q.getOption4());
        }
        }
          return list1;
    }         
   


    
    
    public boolean checkAdminLogin(String id, String password)
    {
        List<Login> list = template.find("from Login where id=? and password=?", id, password);

        if (list.isEmpty())
            return false;
        else
            return true;
    }
     public boolean checkStudentLogin(String id, String password)
    {
        List<Login> list = template.find("from Student where id=? and password=?", id, password);

        if (list.isEmpty())
            return false;
        else
            return true;
    }
    
    
    public boolean verification(String id, String password) {

    List<Login> list =template.find("from Login where id=? and password=?",id,password);

    if (list.isEmpty()) {
        return false;
    } else {
        return true;
    }
    
}
    
    public List<Student> showUserData() {
    List<Student> list = template.find("from Student");
    return list;
}
    
     public List<Question> showQuestion() {
    List<Question> list = template.find("from Question");
    return list;
}

     public boolean verificationstudent(String id, String password) {

    List<Login> list =template.find("from Student where id=? and password=?",id,password);

    if (list.isEmpty()) {
        return false;
    } else {
        return true;
    }
    
}
     
     
     
    
    public void createAccount(Student student) {
    template.save(student); // replacement of insert query
}
     public void createQuestion(Question question) {
    template.save(question); // replacement of insert query
}

    public void changePassword(String id, String newPassword) {

    List<Login> record =
            template.find("from Login where id=?",id);

    for (Login data : record) {
        data.setPassword(newPassword);
        template.update(data);
    }
    }
    
    public void addQuestion(Question question) {
    template.save(question); // replacement of insert query
}
    
    public void deleteRecord(String id) {

    List<Student> record =
            template.find("from Student where id = ?", id);

    for (Student data : record) {
        template.delete(data);
    }
}
    
     
    public void deleteQuestion(int SerialNo) {

    List<Question> record =
            template.find("from Question where SerialNo = ?", SerialNo);

    for (Question data : record) {
        template.delete(data);
    }
}
    
    public void updateQuestion(String SerialNo,String techId,String technology,String question,String option1,String option2,String option3,String option4,String correctOption) {

    List<Question> list =
            template.find("from Question where SerialNo = ?", SerialNo);

    for (Question data : list) {
       
        data.setTechId(techId);
        data.setTechnology(technology);
        data.setQuestion(question);
        data.setOption1(option1);
        data.setOption2(option2);
        data.setOption3(option3);
        data.setOption4(option4);
        data.setCorrectOption(correctOption);
 
        template.update(data);
    }
        }
  
    public List<Student> callUserRecord(String id) {

    List<Student> list =
            template.find("from Student where id = ?", id);

    return list;
}
    public List<Question> callQuestion(int serialNo) {

    List<Question> list =
            template.find("from Question where SerialNo = ?", serialNo);

    return list;
}
    
    
    public void updateProfile(String id,String fullName,String Course, String contact,
                          String dob, String Country, String city,String Address ,String mailid) {

    List<Student> record =
            template.find("from Student where id = ?", id);

    for (Student data : record) {
        data.setFullName(fullName);
        data.setCourse(Course);
        data.setContact(contact);
        data.setDob(dob);
        data.setCountry(Country);
        data.setCity(city);
        data.setAddress(Address);
        data.setMailid(mailid);
        template.update(data);
    }
}
    
    public void deleteAcc(String id,String password)
    {
        List<Student> record =
            template.find("from Student where id=? and password=?", id,password);

    if (record.isEmpty())
    {
        System.out.println("no record found");
    }
    else
    {
        for (Student data : record)
        {
            template.delete(data);
        }
        System.out.println("record deleted....");
    }
    }
    
    
    public void updateQuestion(int SerialNo,String techId,String technology,String question,String option1,String option2,String option3,String option4,String correctOption) {

    List<Question> list =
            template.find("from Question where SerialNo = ?", SerialNo);

    for (Question data : list) {
       
        data.setTechId(techId);
        data.setTechnology(technology);
        data.setQuestion(question);
        data.setOption1(option1);
        data.setOption2(option2);
        data.setOption3(option3);
        data.setOption4(option4);
        data.setCorrectOption(correctOption);
 
        template.update(data);
    }
        }
//    public void createBank(Bank bank)
//    {
//        template.save(bank);   // replacement of insert query
//    System.out.println("bank created!!!!");
//
//    // IOR by anonymous inner class
//    template.execute(new HibernateCallback<Object>()
//    {
//        @Override
//        public Object doInHibernate(Session session) throws HibernateException, SQLException
//        {
//            session.save(bank);
//            return null;
//        }
//    });
//    }
//
//    public void deleteBank(int registrationNo)
//    {
//        List<Bank> record =
//            template.find("from Bank where regNo=?", registrationNo);
//
//    if (record.isEmpty())
//    {
//        System.out.println("no record found");
//    }
//    else
//    {
//        for (Bank data : record)
//        {
//            template.delete(data);
//        }
//        System.out.println("record deleted....");

//        // IOR
//        template.execute(new HibernateCallback<Object>()
//        {
//            @Override
//            public Object doInHibernate(Session session)
//                    throws HibernateException, SQLException
//            {
//                Bank bank =
//                        (Bank) session.get(Bank.class, registrationNo);
//
//                if (bank == null)
//                {
//                    System.out.println("no record found");
//                }
//                else
//                {
//                   session.delete(bank);
//                   System.out.println("record deleted.....");
//                }
//                return null;
//            }
//        });
//    }
//    }
//
//    public void updateBank()
//    {
//       Scanner sc = new Scanner(System.in);
//
//    System.out.println("Enter registration no to update");
//    int registrationNo = sc.nextInt();
//
//    List<Bank> record =
//            template.find("from Bank where regNo=?", registrationNo);
//
//    if (record.isEmpty())
//    {
//        System.out.println("no record found");
//    }
//    else
//    {
//        System.out.println("Enter new bank name");
//        String bankName = sc.next();
//
//        System.out.println("Enter new services");
//        String services = sc.next();
//
//        for (Bank bank : record)
//        {
//            bank.setBankName(bankName);
//            bank.setServices(services);
//
//            template.update(bank);
//        }
//
//        System.out.println("record updated....");
//
//        // or
//        template.execute(new HibernateCallback<Object>()
//        {
//            @Override
//            public Object doInHibernate(Session session)
//                    throws HibernateException, SQLException
//            {
//                Bank bank =
//                        (Bank) session.get(Bank.class, registrationNo);
//
//                if (bank == null)
//                {
//                    System.out.println("no record found");
//                }
//                else
//                {
//                    bank.setBankName(bankName);
//                    bank.setServices(services);
//
//                    session.update(bank);
//                }
//                return null;
//            }
//        });
//    }
//    }
//    public void searchBank()
//    {
//        Scanner sc = new Scanner(System.in);
//
//    System.out.println("Enter registration no to search");
//    int registrationNo = sc.nextInt();
//
//    List<Bank> record =
//            template.find("from Bank where regNo=?", registrationNo);
//
//    if (record.isEmpty())
//    {
//        System.out.println("no record found");
//    }
//    else
//    {
//        for (Bank bank : record)
//        {
//            System.out.println(bank);
//        }
//
//        // or
//        template.execute(new HibernateCallback<Object>()
//        {
//            @Override
//            public Object doInHibernate(Session session)
//                    throws HibernateException, SQLException
//            {
//                Bank bank =(Bank) session.get(Bank.class, registrationNo);
//
//                if (bank == null)
//                {
//                    System.out.println("no record found");
//                }
//                else
//                {
//            
//                     System.out.println(bank.getRegNo() + " " + bank.getBankName() + " " +bank.getServices());
//        }
//                return null;
//            }
//        });
//    }
//    }
//    public void showAllBank()
//    {
//        List<Bank> record = template.find("from Bank");
//
//    if (record.isEmpty())
//    {
//        System.out.println("no records found");
//    }
//    else
//    {
//        for (Bank bank : record)
//        {
//            System.out.println(bank);
//        }
//
//        // OR
//        template.execute(new HibernateCallback<Object>()
//        {
//            @Override
//            public Object doInHibernate(Session session)
//                    throws HibernateException, SQLException
//            {
//               Query q = session.createQuery("from Bank");
//                List<Bank> data = q.list(); 
//
//                if (data.isEmpty())
//                {
//                    System.out.println("no records found");
//                }
//                else
//                {
//                    for (Bank bank : data)
//                    {
//                        System.out.println(bank);
//                    }
//                }
//                return null;
//            }
//        });
//    }
//    }
    
}
    
