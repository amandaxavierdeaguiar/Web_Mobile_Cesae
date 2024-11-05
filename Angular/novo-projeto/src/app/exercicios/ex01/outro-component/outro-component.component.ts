import { Component, EventEmitter, Input, Output, } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-outro-component',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './outro-component.component.html',
  styleUrl: './outro-component.component.scss'
})


export class OutroComponentComponent {
  @Output() mudancaNome = new EventEmitter<string>();
  @Input() nome: string ='';

  mudarNome(novoNome: string) {
    this.nome = novoNome;
    this.mudancaNome.emit(this.nome);
  }
}
