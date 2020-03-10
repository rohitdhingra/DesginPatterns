package com.builder.pattern;

class Person2
{
    public String name;
    public String age;
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}
    
}
public class CodeBuilder
{
    protected Person2 person= new Person2();
    public CodeBuilder(String className)
    {
        if(className.equals("Person"))
        {
            
        }
        
    }
    
    public CodeBuilder addField(String name, String type)
    {
        if(type.equals("String"))
        this.person.name=name;
        else if(type.equals("int"))
        this.person.age= name;
        return this;
    }

	@Override
	public String toString() {
		return "CodeBuilder [person=" + person + "]";
	}
    
}
