import 'package:flutter/material.dart';
void main() {
  runApp(MaterialApp(
    theme: ThemeData(
      primarySwatch: Colors.lightGreen,
      brightness: Brightness.light,
      primaryColor: Colors.transparent,
      secondaryHeaderColor: Colors.pinkAccent,
      textTheme: TextTheme(
          titleLarge: TextStyle(fontSize: 35,fontWeight:
          FontWeight.bold,color: Colors.teal,fontFamily: 'Georgia',),
          displayLarge: TextStyle(fontSize: 20,fontWeight:
          FontWeight.bold,fontStyle: FontStyle.italic,color: Colors.black,fontFamily:
          'Arial',)
      ),
    ),
    home: Home(),
  ));
}
class Home extends StatefulWidget {
  const Home({super.key});
  @override
  State<Home> createState() => _HomeState();
}
class _HomeState extends State<Home> {
  var result= '';
  final TextEditingController first = TextEditingController();
  final TextEditingController second = TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Theme Designing",style: TextStyle(color:
        Colors.white60),),
        backgroundColor: Theme.of(context).secondaryHeaderColor,
      ),
      body: Center(
        child: Column(
          children: [
            TextField(
              controller: first,
              decoration: InputDecoration(hintText: "Enter first name "),
              style:
              Theme.of(context).textTheme.displayLarge!.copyWith(color:
              Colors.pinkAccent),
              keyboardType: TextInputType.text,
            ),
            TextField(
              controller: second,
              decoration: InputDecoration(hintText: "Enter last name "),
              style: Theme.of(context).textTheme.displayLarge!.copyWith(color: Colors.amber),
              keyboardType: TextInputType.text,
            ),
            ElevatedButton(onPressed: (){
              setState(() {
                var a = first.text;
                var b= second.text;
                result = '$a $b';
              });
            }, child:Text("Click Here !"),),
            Text('$result',style:
            Theme.of(context).textTheme.displayLarge!.copyWith(color: Colors.blueAccent),),
          ],
        ),
      ),
    );
  }
}
