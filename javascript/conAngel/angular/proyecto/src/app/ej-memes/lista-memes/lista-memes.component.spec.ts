import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaMemesComponent } from './lista-memes.component';

describe('ListaMemesComponent', () => {
  let component: ListaMemesComponent;
  let fixture: ComponentFixture<ListaMemesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListaMemesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaMemesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
