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
  double result =0;
  final TextEditingController first=TextEditingController();
  final TextEditingController second=TextEditingController();
  final TextEditingController output=TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('CLACULATOR'),
        backgroundColor: Colors.green,
      ),
      body: Container(
        child: Column(
          children: [
            TextField(
              controller: first,
              keyboardType: TextInputType.number,
        ),
            SizedBox(height: 20,),
            TextField(controller: second,
            keyboardType: TextInputType.number,),
            Row(
              children: [
                ElevatedButton(onPressed:(){
                  double a=double.parse(first.text);
                  double b=double.parse(second.text);
                setState((){
               result=a+ b;
    });
                }, child:Text('ADDITION'),),
                ElevatedButton(onPressed: (){
                double a=double.parse(first.text);
                double b=double.parse(second.text);
                setState((){
                result=a-b;
                });
                }, child:Text('SUBTRACTION'),),
                ElevatedButton(onPressed:(){
                double a=double.parse(first.text);
                double b=double.parse(second.text);
                setState((){
                result=a*b;
                });
                }, child:Text('MULTIPLICATION'),),
                ElevatedButton(onPressed:(){
                double a=double.parse(first.text);
                double b=double.parse(second.text);
                setState((){
                result=a/b;
                });
                }, child:Text('DIVISION'),),
              ],
            ),
            Text(' Result: $result',style: TextStyle(fontSize: 22,fontWeight: FontWeight.bold),)

          ],
        ),
      ),
    );
  }
}
