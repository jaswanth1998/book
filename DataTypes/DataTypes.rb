h = { :name => "Jane", :age => 17 }

p true.class, false.class
p "Ruby".class
p 1.class
p 4.5.class
p 3_463_456_457.class
p :age.class
p [1, 2, 3].class
p h.class

#!/usr/bin/ruby

# kid.rb

bool = [true, false]

male = bool[rand(2)]


if male
    puts "We will use name John"
else 
    puts "We will use name Victoria"
end

p :name
p :name.class
p :name.methods.size
p "Jane".methods.size

p :name.object_id
p :name.object_id
p "name".object_id
p "name".object_id
p -2
p 121
p 123265
p -34253464356
p 34867367893463476

p 1.class
p 23453246.class
p 234532423563456346.class
p 2345324235632363463456456346.class

p 5 / 2
p 5.div 2
p 15.4
p 0.3455
p -343.4563

p 12.5.class
p -12.5.class
p (5.0 / 2).class

p 5.fdiv 2
p 12.to_f