name = gets.chomp
case name
when "Alice"
  puts "Welcome Alice"
when /[qrz].+/i
  puts "Your name begins with Q, R or Z, you're not welcome here!"
else
  puts "Welcome stranger!"
end