import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-meu-componente',
  standalone: true,
  imports: [ RouterOutlet, MeuComponenteComponent, FormsModule],
  templateUrl: './meu-componente.component.html',
  styleUrl: './meu-componente.component.scss'
})
export class MeuComponenteComponent {
  meuNome = 'Amanda';
  mensagem = 'Curso de Angular'
  estaAtivado = false
  corDeFundo = '#273631'

  onClick() {
    this.estaAtivado = ! this.estaAtivado;
    this.meuNome = 'Bianca';
  }
}


