import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {MatListModule} from '@angular/material/list';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AllGroceryListsComponent } from './all-grocery-lists/all-grocery-lists.component';
import { IndividualGroceryListComponent } from './individual-grocery-list/individual-grocery-list.component';

@NgModule({
  declarations: [
    AppComponent,
    
    AllGroceryListsComponent,
    IndividualGroceryListComponent
  ],
  imports: [
    BrowserModule,
    MatListModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
