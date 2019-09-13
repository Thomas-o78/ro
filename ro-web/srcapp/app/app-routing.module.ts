import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/homeA/home.component';
import {CreationHComponent} from './home/creation-h/creation-h.component';


const routes: Routes = [

  {
    path: ' ',
   redirectTo: 'home',
    pathMatch: 'full'

  },

  {
    path: 'home',
    component : HomeComponent,
  },
  {
    path: 'index',
    loadChildren: () => import('./home/home.module').then(mod => mod.HomeModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
