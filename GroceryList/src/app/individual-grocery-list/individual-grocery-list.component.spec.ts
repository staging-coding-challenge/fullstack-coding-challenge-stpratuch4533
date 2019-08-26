import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IndividualGroceryListComponent } from './individual-grocery-list.component';

describe('IndividualGroceryListComponent', () => {
  let component: IndividualGroceryListComponent;
  let fixture: ComponentFixture<IndividualGroceryListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IndividualGroceryListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IndividualGroceryListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
