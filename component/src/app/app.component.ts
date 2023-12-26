import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'component';
  

  ishidden=false
  isdisabled=false

  isactive=true
  active:object={color:'white',background:'grey'}
  count=0;
  incr(){
   this.count+=1;
  }
 
 
  decr(){
   this.count-=1
  }
  tname=""
show=true

wish="Good Morning"
person={"name":"bhumi","gender":"f"}


}
