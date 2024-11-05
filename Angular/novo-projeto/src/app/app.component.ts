import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { MeuComponenteComponent } from "./components/meu-componente/meu-componente.component";
import { OutroComponenteComponent } from "./components/outro-componente/outro-componente.component";
import { Ex01Component } from "./exercicios/ex01/ex01.component";
import { TesteNgifComponent } from './componentsssss/teste-ngif/teste-ngif.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MeuComponenteComponent, OutroComponenteComponent, Ex01Component, RouterLink, RouterLinkActive, TesteNgifComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'novo-projeto';
}
