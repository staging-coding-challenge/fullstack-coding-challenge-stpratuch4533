import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllGroceryListsComponent } from './all-grocery-lists.component';

describe('AllGroceryListsComponent', () => {
  let component: AllGroceryListsComponent;
  let fixture: ComponentFixture<AllGroceryListsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllGroceryListsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllGroceryListsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
