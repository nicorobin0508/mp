import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(home: Home()));

class Home extends StatefulWidget {
  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  var result = '';
  final TextEditingController first = TextEditingController();
  final TextEditingController second = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Simple UI")),
      body: Center(
        child: Column(
          children: [
            TextField(
              controller: first,
              decoration: InputDecoration(hintText: "Enter first name"),
            ),
            TextField(
              controller: second,
              decoration: InputDecoration(hintText: "Enter last name"),
            ),
            ElevatedButton(
              onPressed: () {
                setState(() {
                  var a = first.text;
                  var b = second.text;
                  result = '$a $b';
                });
              },
              child: Text("Click Here!"),
            ),
            Text(result),
          ],
        ),
      ),
    );
  }
}
