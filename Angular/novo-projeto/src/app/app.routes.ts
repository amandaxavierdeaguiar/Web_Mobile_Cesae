import { Routes } from '@angular/router';
import { Ex01Component } from './exercicios/ex01/ex01.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { OutroComponentComponent } from './exercicios/ex01/outro-component/outro-component.component';
import { TesteNgifComponent } from './componentsssss/teste-ngif/teste-ngif.component';

export const routes: Routes = [
  {path: 'ex01', component:Ex01Component},
  {path: 'ngif', component: TesteNgifComponent},
  {path: '**', component: NotFoundComponent},
  {path: 'outro', component: OutroComponentComponent},
  {path: '', redirectTo:'/outro', pathMatch:'full'}
];
