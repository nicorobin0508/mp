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
  var result=' ';
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Different Widget'),
        centerTitle: true, backgroundColor: Colors.red[600],
      ),
      body: Container(
        padding: EdgeInsets.symmetric(horizontal: 40.0,vertical: 10.0),
        margin: EdgeInsets.all(50.0),
        color:Colors.blueGrey[400],
        child: Row(
          children: [
            Column(
              children: [
                Text('Hello'),
                Icon(Icons.circle,color: Colors.green[500],),
                Image.asset('image/img.png',width: 240,height: 290,),
              ],
            ),
            Column(
              children: [
                Text('HI'),
                ElevatedButton(onPressed: (){
                  setState(() {
                    result='YOU CLICKED THE CIRCLE BUTTON';
                  });
                }, child: Icon(Icons.circle,color: Colors.yellow[500],),),
                Image.asset('image/img1.png', height: 300, width: 300,),
              ],
            ),
            Text('$result',style: TextStyle(fontSize: 22.0,fontWeight: FontWeight.bold,),),
          ],
        ),
      ),
      );

  }
}
