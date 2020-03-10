//package com.builder.pattern;
//
//class Person2
//{
//  // address
//  public String streetAddress, postcode, city;
//
//  // employment
//  public String companyName, position;
//  public int annualIncome;
//
//  @Override
//  public String toString()
//  {
//    return "Person{" +
//      "streetAddress='" + streetAddress + '\'' +
//      ", postcode='" + postcode + '\'' +
//      ", city='" + city + '\'' +
//      ", companyName='" + companyName + '\'' +
//      ", position='" + position + '\'' +
//      ", annualIncome=" + annualIncome +
//      '}';
//  }
//}
//
//class PersonBuilder2{
//  // the object we're going to build
//  protected Person2 person = new Person2(); // reference!
//
//  public PersonJobBuilder works()
//  {
//    return new PersonJobBuilder(person);
//  }
//
//  public PersonAddressBuilder lives()
//  {
//    return new PersonAddressBuilder(person);
//  }
//
//  public Person2 build()
//  {
//    return person;
//  }
//}
//
//class PersonAddressBuilder extends PersonBuilder2
//{
//  public PersonAddressBuilder(Person2 person)
//  {
//    this.person = person;
//  }
//
//  public PersonAddressBuilder at(String streetAddress)
//  {
//    person.streetAddress = streetAddress;
//    return this;
//  }
//
//  public PersonAddressBuilder withPostcode(String postcode)
//  {
//    person.postcode = postcode;
//    return this;
//  }
//
//  public PersonAddressBuilder in(String city)
//  {
//    person.city = city;
//    return this;
//  }
//}
//
//class PersonJobBuilder extends PersonBuilder2
//{
//  public PersonJobBuilder(Person2 person)
//  {
//    this.person = person;
//  }
//
//  public PersonJobBuilder at(String companyName)
//  {
//    person.companyName = companyName;
//    return this;
//  }
//
//  public PersonJobBuilder asA(String position)
//  {
//    person.position = position;
//    return this;
//  }
//
//  public PersonJobBuilder earning(int annualIncome)
//  {
//    person.annualIncome = annualIncome;
//    return this;
//  }
//}
//
//class BuilderFacetsDemo
//{
//  public static void main(String[] args)
//  {
//    PersonBuilder2 pb = new PersonBuilder2();
//    Person2 person = pb
//      .lives()
//        .at("123 London Road")
//        .in("London")
//        .withPostcode("SW12BC")
//      .works()
//        .at("Fabrikam")
//        .asA("Engineer")
//        .earning(123000)
//      .build();
//    System.out.println(person);
//  }
//}
