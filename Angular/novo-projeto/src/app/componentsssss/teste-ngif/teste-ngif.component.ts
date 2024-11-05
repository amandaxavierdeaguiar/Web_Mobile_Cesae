import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-teste-ngif',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './teste-ngif.component.html',
  styleUrl: './teste-ngif.component.scss'
})
export class TesteNgifComponent {
  valor:number =10;
  numero:number = -10;
}
