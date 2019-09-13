import { BrowserModule } from '@angular/platform-browser';

import { NgSelectModule } from '@ng-select/ng-select';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import {ModalShareModule} from './modal/modal.share.component.module';

import {NavModule} from './nav/nav.component.module';
import {HomeModule} from './home/home.module';
import {StoreModule} from '@ngrx/store';
import {StoreDevtoolsModule} from '@ngrx/store-devtools';

import {TranslateLoader, TranslateModule} from "@ngx-translate/core";
import {ToastrModule} from 'ngx-toastr';

import {APP_INITIALIZER, Injector, LOCALE_ID, NgModule} from '@angular/core';
import {AppInitProvider} from './appinit/appInitProvider';
import {appInitProviderFactory} from './appinit/appInitProviderFactory';
import {HTTP_INTERCEPTORS, HttpClient, HttpClientModule} from '@angular/common/http';
import {TranslateHttpLoader} from "@ngx-translate/http-loader";

import { refreducer } from './state/reducers/ref-acte-gestion/ref-acte-gestion.reducers';

import { Activitereducer } from './state/reducers/ref-activite/ref-activite.reducers';
import { SActivitereducer } from './state/reducers/ref-secteur-activite/ref-secteur-activite.reducers';
import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import {library} from '@fortawesome/fontawesome-svg-core';
import {
  faPlusCircle,
  faPlus,
  faMinus,
  faMinusCircle, } from '@fortawesome/free-solid-svg-icons';
import { EffectsModule } from '@ngrx/effects';

library.add(faPlusCircle, faPlus, faMinus, faMinusCircle);

const reducers11 = {
  referenceActeGestion: refreducer,
  referenceActivite : Activitereducer,
  referenceSecteurActivite : SActivitereducer
};

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http,  '.json');
}
@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    ToastrModule.forRoot({
      timeOut: 5000,
      positionClass: 'toast-top-right',
      preventDuplicates: true,
    }),
    FormsModule,
    NavModule,
    NgSelectModule,
    HttpClientModule,
    HomeModule,
    FontAwesomeModule,
    ModalShareModule,
    StoreModule.forRoot(reducers11),
    StoreDevtoolsModule.instrument({
      maxAge: 25, // Retains last 25 states
    }),
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    })
  ],


  bootstrap: [AppComponent]
})
export class AppModule {

}
