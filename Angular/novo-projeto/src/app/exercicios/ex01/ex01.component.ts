import { Component } from '@angular/core';
import { OutroComponentComponent } from './outro-component/outro-component.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex01',
  standalone: true,
  imports: [OutroComponentComponent, FormsModule],
  templateUrl: './ex01.component.html',
  styleUrl: './ex01.component.scss'
})
export class Ex01Component {
  public nomeUtilizador = 'Amanda';
  public idadeUtilizador = 32;
  public novoNome: string = '';

  mudancaNome(novoNome: any) {
    this.nomeUtilizador = this.novoNome;
  }
}
