import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-contador',
  standalone: true,
  imports: [],
  templateUrl: './contador.component.html',
  styleUrl: './contador.component.scss'
})
export class ContadorComponent {
  @Output() mudancaContador = new EventEmitter();
  @Input() aux: number =0;

  incrementar(){
    this.aux++;
    this.mudancaContador.emit(this.aux);
  }

  decrementar(){
    this.aux--;
    this.mudancaContador.emit(this.aux);
  }
}
