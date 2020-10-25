#1) What is hibernate?
#2) What is ORM?
#3) Explain hibernate architecture?
#4) What are the core interfaces of Hibernate?
#5) Mention some of the advantages of using ORM over JDBC.
#6) Define criteria in terms of Hibernate.
#7) List some of the databases supported by Hibernate.
#8) List the key components of Hibernate.
#9) Mention two components of Hibernate configuration object.
#10) How is SQL query created in Hibernate?
#11) What does HQL stand for?
#12) How is HQL query created?
#13) How can we add criteria to a SQL query?
#15) What is SessionFactory?
#16) Is SessionFactory a thread-safe object?
#17) What is Session?
#18) Is Session a thread-safe object?
#19) What is the difference between session.save() and session.persist() method?
#20) What is the difference between get and load method?
#21) What is the difference between update and merge method?
#22) What are the states of the object in hibernate?
#23) What object transition diagram
#24) How to make an immutable class in hibernate?
#25) What is automatic dirty checking in hibernate?
#26) How many types of association mapping are possible in hibernate?
#27) Is it possible to perform collection mapping with One-to-One and Many-to-One?
#28) What is lazy loading in hibernate?
#29) What is HQL (Hibernate Query Language)?
#30) What is the difference between first level cache and second level cache?





#1) What is hibernate?
     1) Hibernate is a light weight orm tool used for, storing retriving, manipulating data into databses.
     2) as hibernate being the orm tool it brigdes the gap between the object world and the db world.
     3) provides automatic table creation.
     4) simplifies complex join via hibernate mappings.
     5) provides HQL which is hibernate query language independent of sql.
     6) Fast performance becasue of l1, l2 cache.


#2) What is ORM?
     1) ORM is accronym for object releation mapping, it provide the facility to map java pojo into 
        database tables and columns and the values store in the entites as rows.
     2) It simplyfies data creation, access and manipulation.


#3) Explain hibernate architecture?
    1) It starts with JDBC and Conection provide -> Session factory -> Trasaction factory.
        a) JDBC and concection provider: provides the concection to the databses.
        b) Session factory: creates sessions objects and initializes first level cache when you call hibernateUtil.getSessionFactory().
        c) transaction: created when you call session.beginTransaction() it provides impl of transaction using TransactionFactory.
        d) Persistent object: is the object which is .save() and then .commit() in the database.


#4) What are the core interfaces of Hibernate?
    1) Configuration.
    2) Session Factory.
    3) session.
    4) Query.
    6) Criteria.
    7) Transaction.

#5) Mention some of the advantages of using ORM over JDBC.
    ORM has many advantages over JDBC.
        1) Application development is fast.
        2) Different level of cache makes retrival and performance faster.
        3) Automatic Table creation.
        4) Details of SQL are encasulated by hibernate.


#6) Define criteria in terms of Hibernate.
    1) The hibernate criterion query allow the developer to mention the criteria while retriving the data from databases.
    2) Below eg show how the critera query works:
        a) Criteria cr = session.createCriteria(Employee.class)  // this will initialize the object of criteria using which we can define criterias.
        b) cr.add(Restriction.eq("salary", 25000))               // eq refers to equal this tell that get the Employee data whose salary equal to 2500.
        c) cr.add(Restriction.gt("experience", 2))               // gt refers to greater than this tell that get the Empploye data whose experience is greater than 2 years and salary is equal to 2500.
        d) cr.add(Restriction.like("name", "p%"))                // like give you record whose the name of person start with "p".
    3) like this you can keep on adding the criteria and providing the Restrictions in it. 
    

##7) List some of the databases supported by Hibernate.
    1) Msql.
    2) PostgreSql.
    3) Orcale.
    4) HSQL.
    5) Frontbase.


##8) List the key components of Hibernate.
    1) Configuration    //Help to bootstrap concetion with databases and class mapping etc
    2) SessionFactory   // Creates session.
    3) Session          // provide quering facility and caching as well encapsulating db connections.
    4) Query            // Provide multiple query implmentations like SQLQueries, HQL queries etc.
    5) transaction      // provide facility to maintan data consistency by commit or rollback

##9) Mention two components of Hibernate configuration object.
    1) Connection provider.
    2) class mapping.


##10) How is SQL query created in Hibernate?
    1) uses session.createSqlQuery().


##11) What does HQL stand for?
    1) Hibernate Query Language.


##12) How is HQL query created?
    1) just call session.creatQuery().


##13) How can we add criteria to a SQL query?
    1) Criteria cr = session.createCriteria(Student.class)
    2) cr.add(Restriction.eq("name", "kazama"))
    

##15) What is SessionFactory?
    1) Is the factory that privides hibernate session objects.
    2) when create? usually during application startup
    3) how to create it delibrately? provide configuration <session-factory> in hibernate.xml the instansiate new Configuration().configure().buildSessionfactory().
    4) It is absolutely threadsafe, mulitiple thread uses Sessionfactory to get there own instance of session.
    5) it also hold metadata for object relation mapping, hence it is immutable as well.   


##16) Is SessionFactory a thread-safe object?
    1) It is absolutely threadsafe, mulitiple thread uses Sessionfactory to get there own instance of session.


##17) What is Session?
    1) Session is an iterface between your application and data store inside database.
    2) Session since its talking with DB it also encapsulates datase connections.
    3) Session is a factory for Transaction, Query, Criteria.
    4) Session also hold first level cache which is by default active.
    5) Transaction tr = session.beginTransaction() will provide you the impl for trasaction.
    6) Query q = session.createQuery() will provide you the impl for Query.
    7) Criteria cr = session.createCriteria() will provide you the impl for Criteria.
    


##18) Is Session a thread-safe object?
    1) Session object are not thread safe hence it should not be delibrately share amongst other threads.


##19) What is the difference between session.save() and session.persist() method?
    1) Save: Return Identifier of the instance.
             Its return type is Serializable.
    2) Persist: Returns nothing for instance.
             Its retrun type is void.


#20) What is the difference between get and load method?
   Get               |       Load
---------------------|------------------
1) return null if object not found  |  throws ObjectNotfoundException
2) always hits database   | gets data from cache if present
3) return real object  | return proxy of the object.
4) used when you're not sure if object exist | use when you're sure that object exists


##21) What is the difference between update and merge method?
Update | Merge
-------|-------
1) when update called on detached instance: it will give NonUniqueObjectException | whereas merge will update it updated value.
2) you should use update when you're sure that session doesn't contains pressistent object with same identifier | use merge when you want to save youre modification any time without knowing or bother about the state of the session

##22) What are the states of the object in hibernate?
    1) Transient => when the object is just create with new 
    2) Persistant => when the object is stored in the session using.
                     a) save()
                     b) saveOrUpdate()
                     c) perssist()
    3) Detached => when the object is evicted from session or session is closed using.
                     a) evict()
                     b) close()

##23) What object transition diagram



##24) How to make an immutable class in hibernate?
    1) mark class as mutable=false by default its true.

##25) What is automatic dirty checking in hibernate?
    1) Automatic dirty checking is the feature of hibernate which synchornizes the state of persitent object with the object in database.
       So you dont have to call transaction.commit() again and again.
    2) so hibernate calls update() statement as soon as it detects modification in the objects in transaction.
    3) for eg : a) you've been the transaction
                b) called get() method to get employee object from DB
                c) employe.setSalary(999999999) // you made some change
                d) transaction.commit() // Since this object is already in transaction after making the changes you dont have to merge or update the object again you can directly call .commit() and change will be reflected in DB. 


##26) How many types of association mapping are possible in hibernate?
    1) one to one
    2) one to many
    3) many to one
    4) many to many


##27) Is it possible to perform collection mapping with One-to-One and Many-to-One?
    1) Nope its not possible to perform one to one and many to one mapping.
    2) because one2one relationship state that a man is married to a women (Now a husband wife relation ship is one2one) (the associate amongst them is one2one)
    3) The couple happen to have a childerns luckly twins (Now the association of twin childern -> to their father is many to one) (So both the childern have same father so both of them will be have same reference of there father, hence there's no need of collection)


##28) What is lazy loading in hibernate?
    1) Lazing is used for high performance.
    2) when parent entity is called only the parent entity is loaded in the memory but not the child entity that is associated with the parent.
    3) it load child on demand.
    4) since Hibernate 3, by default lazy loading is true.


##29) What is HQL (Hibernate Query Language)?
    1) Hibernate Query language language is the object oriented query lamguage, 
    The main advantage of this:
        a) You dont have to learn SQL to query on databases.
        b) Database Independent.
        3) Hibernate has simplified quering on DB using this HQL and Hibernate Criteria Query language.


##30) What is the difference between first level cache and second level cache?
First Level Cache | Second Level Cache
------------------|--------------------
1) Scope is only till sessions | Scope is till sessionFactory
2) cannot be shared by other sessions | shared by all the session
3) enable by default in session | you need to enable it explicitly
4) its hibernate internal implementation | you need to use 3rd party like EhCache or Swarms etc.

