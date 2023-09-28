import 'package:flutter/material.dart';
void main() {
 runApp(MaterialApp(
 home: Home(),
 ));
}
class Home extends StatefulWidget {
 const Home({super.key});
 @override
 State<Home> createState() => _HomeState();
}
class _HomeState extends State<Home> {
 double result=0;
 final TextEditingController first=TextEditingController();
 final TextEditingController second=TextEditingController();
 @override
 Widget build(BuildContext context) {
 return Scaffold(
 appBar: AppBar(
 title: Text('State Management',),
 ),
 body: Container(
 child: Column(
 children: [
 TextField(controller: first,
 decoration: InputDecoration(hintText: 'enter first no',),),
 TextField(controller: second,
 decoration: InputDecoration(hintText: 'enter second no',),),
 Row(
 children: [
 ElevatedButton(onPressed: (){
 double a=double.parse(first.text);
 double b=double.parse(second.text);
 setState(() {
 result=a*b;
 });
 }, child: Text('click here'),),
 ],
 ),
 Text('result $result'),
 ],
 ),
 ),
 );
 }
}
