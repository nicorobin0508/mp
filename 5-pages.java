import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home: Home(),
  ));
}
class Home extends StatelessWidget {
  const Home({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Home Page'),
      ),
      body: Container(
        child: Column(
          children: [
            Text('Welcome To My Home Page',style:TextStyle(fontSize: 22.0,fontWeight: FontWeight.bold,),),
          ElevatedButton(onPressed: (){
            Navigator.push(context,MaterialPageRoute(builder: (context)=>SecondPage()));
          }, child: Text('second Page'),
          ),
          ],
        ),
      ),
    );
  }
}
class SecondPage extends StatelessWidget {
  const SecondPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('This is Second Page'),
      ),
      body: Center(
        child: ElevatedButton(onPressed: (){

          Navigator.pop(context);
        }, child:Text('Home Page'),
      ),
  ),
    );
  }
}

